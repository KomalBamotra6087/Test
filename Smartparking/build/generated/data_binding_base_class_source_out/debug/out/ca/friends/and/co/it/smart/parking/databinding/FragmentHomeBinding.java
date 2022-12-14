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

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView bookImagebtn;

  @NonNull
  public final ImageView feedbackImagebtn;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ConstraintLayout navHome;

  @NonNull
  public final ImageView shareImagebtn;

  @NonNull
  public final ImageView supportImagebtn;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView bookImagebtn,
      @NonNull ImageView feedbackImagebtn, @NonNull ImageView imageView10,
      @NonNull ConstraintLayout navHome, @NonNull ImageView shareImagebtn,
      @NonNull ImageView supportImagebtn, @NonNull TextView textView2, @NonNull TextView textView3,
      @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
    this.rootView = rootView;
    this.bookImagebtn = bookImagebtn;
    this.feedbackImagebtn = feedbackImagebtn;
    this.imageView10 = imageView10;
    this.navHome = navHome;
    this.shareImagebtn = shareImagebtn;
    this.supportImagebtn = supportImagebtn;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.book_imagebtn;
      ImageView bookImagebtn = ViewBindings.findChildViewById(rootView, id);
      if (bookImagebtn == null) {
        break missingId;
      }

      id = R.id.feedback_imagebtn;
      ImageView feedbackImagebtn = ViewBindings.findChildViewById(rootView, id);
      if (feedbackImagebtn == null) {
        break missingId;
      }

      id = R.id.imageView10;
      ImageView imageView10 = ViewBindings.findChildViewById(rootView, id);
      if (imageView10 == null) {
        break missingId;
      }

      ConstraintLayout navHome = (ConstraintLayout) rootView;

      id = R.id.share_imagebtn;
      ImageView shareImagebtn = ViewBindings.findChildViewById(rootView, id);
      if (shareImagebtn == null) {
        break missingId;
      }

      id = R.id.support_imagebtn;
      ImageView supportImagebtn = ViewBindings.findChildViewById(rootView, id);
      if (supportImagebtn == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, bookImagebtn, feedbackImagebtn,
          imageView10, navHome, shareImagebtn, supportImagebtn, textView2, textView3, textView4,
          textView5, textView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
