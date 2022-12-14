// Generated by view binder compiler. Do not edit!
package ca.friends.and.co.it.smart.parking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ca.friends.and.co.it.smart.parking.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialButton btnRegister;

  @NonNull
  public final TextInputEditText etRegEmail;

  @NonNull
  public final TextInputEditText etRegPass;

  @NonNull
  public final TextView tvLoginHere;

  private ActivityRegisterBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialButton btnRegister, @NonNull TextInputEditText etRegEmail,
      @NonNull TextInputEditText etRegPass, @NonNull TextView tvLoginHere) {
    this.rootView = rootView;
    this.btnRegister = btnRegister;
    this.etRegEmail = etRegEmail;
    this.etRegPass = etRegPass;
    this.tvLoginHere = tvLoginHere;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnRegister;
      MaterialButton btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.etRegEmail;
      TextInputEditText etRegEmail = ViewBindings.findChildViewById(rootView, id);
      if (etRegEmail == null) {
        break missingId;
      }

      id = R.id.etRegPass;
      TextInputEditText etRegPass = ViewBindings.findChildViewById(rootView, id);
      if (etRegPass == null) {
        break missingId;
      }

      id = R.id.tvLoginHere;
      TextView tvLoginHere = ViewBindings.findChildViewById(rootView, id);
      if (tvLoginHere == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((LinearLayout) rootView, btnRegister, etRegEmail,
          etRegPass, tvLoginHere);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
