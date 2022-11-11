package ca.friends.and.co.it.smart.parking;

import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;


public class SettingFragment extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
        Load_setting();

       }


    private void Load_setting() {


        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);

        boolean chk_night = sp.getBoolean("NIGHT", false);
        if (chk_night) {
            getListView().setBackgroundColor(Color.parseColor("#222222"));

        } else {
            getListView().setBackgroundColor(Color.parseColor("#ffffff"));
        }

        CheckBoxPreference chk_night_instant = (CheckBoxPreference) findPreference("NIGHT");
        chk_night_instant.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(android.preference.Preference preference, Object o) {

                boolean yes = (boolean) o;
                if (yes) {
                    getListView().setBackgroundColor(Color.parseColor("222222#"));
                } else {
                    getListView().setBackgroundColor(Color.parseColor("#ffffff"));
                }


                return true;
            }
        });

        ListPreference LP = (ListPreference)findPreference("ORIENTATION");
        String ori =sp.getString("ORIENTATION","False");
        if("1".equals(ori)){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_BEHIND);
        }
        else if ("2".equals(ori)){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        else if ("3".equals(ori)) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
        LP.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(android.preference.Preference prefs, Object o) {
                String items =(String)o;
                if (prefs.getKey().equals("ORIENTATION"))
                {
                    switch (items){
                        case "1":
                            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_BEHIND);
                            break;
                        case "2":
                            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                            break;
                        case "3":
                            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                            break;
                    }

                    ListPreference LPP =(ListPreference)prefs;
                    LPP.setSummary(LPP.getEntries()[LPP.findIndexOfValue(items)]);
                }

                return true;
            }
        });


    }
    @Override
    protected void onResume(){
    Load_setting();
    super.onResume();
        }



}
