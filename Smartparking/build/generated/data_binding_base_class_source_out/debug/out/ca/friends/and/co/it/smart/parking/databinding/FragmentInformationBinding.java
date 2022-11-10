// Generated by view binder compiler. Do not edit!
package ca.friends.and.co.it.smart.parking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ca.friends.and.co.it.smart.parking.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentInformationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView20;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  private FragmentInformationBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageView20, @NonNull TextView textView10, @NonNull TextView textView11,
      @NonNull TextView textView20, @NonNull TextView textView8, @NonNull TextView textView9) {
    this.rootView = rootView;
    this.imageView20 = imageView20;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView20 = textView20;
    this.textView8 = textView8;
    this.textView9 = textView9;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentInformationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentInformationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_information, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentInformationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView20;
      ImageView imageView20 = ViewBindings.findChildViewById(rootView, id);
      if (imageView20 == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = ViewBindings.findChildViewById(rootView, id);
      if (textView20 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      return new FragmentInformationBinding((ConstraintLayout) rootView, imageView20, textView10,
          textView11, textView20, textView8, textView9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
