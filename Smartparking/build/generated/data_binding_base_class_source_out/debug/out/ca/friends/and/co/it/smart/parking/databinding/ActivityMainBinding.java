// Generated by view binder compiler. Do not edit!
package ca.friends.and.co.it.smart.parking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ca.friends.and.co.it.smart.parking.R;
import com.google.android.material.navigation.NavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final FrameLayout activityMainFrameLayout;

  @NonNull
  public final Toolbar activityMainToolbar;

  @NonNull
  public final DrawerLayout myDrawerLayout;

  @NonNull
  public final NavigationView navView;

  private ActivityMainBinding(@NonNull DrawerLayout rootView,
      @NonNull FrameLayout activityMainFrameLayout, @NonNull Toolbar activityMainToolbar,
      @NonNull DrawerLayout myDrawerLayout, @NonNull NavigationView navView) {
    this.rootView = rootView;
    this.activityMainFrameLayout = activityMainFrameLayout;
    this.activityMainToolbar = activityMainToolbar;
    this.myDrawerLayout = myDrawerLayout;
    this.navView = navView;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.activity_main_frame_layout;
      FrameLayout activityMainFrameLayout = ViewBindings.findChildViewById(rootView, id);
      if (activityMainFrameLayout == null) {
        break missingId;
      }

      id = R.id.activity_main_toolbar;
      Toolbar activityMainToolbar = ViewBindings.findChildViewById(rootView, id);
      if (activityMainToolbar == null) {
        break missingId;
      }

      DrawerLayout myDrawerLayout = (DrawerLayout) rootView;

      id = R.id.nav_view;
      NavigationView navView = ViewBindings.findChildViewById(rootView, id);
      if (navView == null) {
        break missingId;
      }

      return new ActivityMainBinding((DrawerLayout) rootView, activityMainFrameLayout,
          activityMainToolbar, myDrawerLayout, navView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
