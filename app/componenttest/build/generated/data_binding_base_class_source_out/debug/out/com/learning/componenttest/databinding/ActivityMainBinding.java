// Generated by view binder compiler. Do not edit!
package com.learning.componenttest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.learning.componenttest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button serviceOff;

  @NonNull
  public final Button serviceOn;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button serviceOff,
      @NonNull Button serviceOn) {
    this.rootView = rootView;
    this.serviceOff = serviceOff;
    this.serviceOn = serviceOn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
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
      id = R.id.serviceOff;
      Button serviceOff = ViewBindings.findChildViewById(rootView, id);
      if (serviceOff == null) {
        break missingId;
      }

      id = R.id.serviceOn;
      Button serviceOn = ViewBindings.findChildViewById(rootView, id);
      if (serviceOn == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, serviceOff, serviceOn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
