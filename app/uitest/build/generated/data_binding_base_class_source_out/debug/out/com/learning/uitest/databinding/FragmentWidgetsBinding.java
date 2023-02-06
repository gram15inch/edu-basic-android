// Generated by view binder compiler. Do not edit!
package com.learning.uitest.databinding;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SearchView;
import android.widget.SeekBar;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.learning.uitest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentWidgetsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CalendarView calendarView;

  @NonNull
  public final View divider;

  @NonNull
  public final View divider2;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ProgressBar progressBar2;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final SearchView searchView;

  @NonNull
  public final SeekBar seekBar;

  @NonNull
  public final SeekBar seekBar2;

  @NonNull
  public final SurfaceView surfaceView;

  @NonNull
  public final TextureView textureView;

  @NonNull
  public final VideoView videoView;

  @NonNull
  public final View view;

  @NonNull
  public final WebView webView;

  private FragmentWidgetsBinding(@NonNull ConstraintLayout rootView,
      @NonNull CalendarView calendarView, @NonNull View divider, @NonNull View divider2,
      @NonNull ImageView imageView, @NonNull ProgressBar progressBar,
      @NonNull ProgressBar progressBar2, @NonNull RatingBar ratingBar,
      @NonNull SearchView searchView, @NonNull SeekBar seekBar, @NonNull SeekBar seekBar2,
      @NonNull SurfaceView surfaceView, @NonNull TextureView textureView,
      @NonNull VideoView videoView, @NonNull View view, @NonNull WebView webView) {
    this.rootView = rootView;
    this.calendarView = calendarView;
    this.divider = divider;
    this.divider2 = divider2;
    this.imageView = imageView;
    this.progressBar = progressBar;
    this.progressBar2 = progressBar2;
    this.ratingBar = ratingBar;
    this.searchView = searchView;
    this.seekBar = seekBar;
    this.seekBar2 = seekBar2;
    this.surfaceView = surfaceView;
    this.textureView = textureView;
    this.videoView = videoView;
    this.view = view;
    this.webView = webView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWidgetsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWidgetsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_widgets, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWidgetsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.calendarView;
      CalendarView calendarView = ViewBindings.findChildViewById(rootView, id);
      if (calendarView == null) {
        break missingId;
      }

      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.divider2;
      View divider2 = ViewBindings.findChildViewById(rootView, id);
      if (divider2 == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.progressBar2;
      ProgressBar progressBar2 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar2 == null) {
        break missingId;
      }

      id = R.id.ratingBar;
      RatingBar ratingBar = ViewBindings.findChildViewById(rootView, id);
      if (ratingBar == null) {
        break missingId;
      }

      id = R.id.searchView;
      SearchView searchView = ViewBindings.findChildViewById(rootView, id);
      if (searchView == null) {
        break missingId;
      }

      id = R.id.seekBar;
      SeekBar seekBar = ViewBindings.findChildViewById(rootView, id);
      if (seekBar == null) {
        break missingId;
      }

      id = R.id.seekBar2;
      SeekBar seekBar2 = ViewBindings.findChildViewById(rootView, id);
      if (seekBar2 == null) {
        break missingId;
      }

      id = R.id.surfaceView;
      SurfaceView surfaceView = ViewBindings.findChildViewById(rootView, id);
      if (surfaceView == null) {
        break missingId;
      }

      id = R.id.textureView;
      TextureView textureView = ViewBindings.findChildViewById(rootView, id);
      if (textureView == null) {
        break missingId;
      }

      id = R.id.videoView;
      VideoView videoView = ViewBindings.findChildViewById(rootView, id);
      if (videoView == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      id = R.id.webView;
      WebView webView = ViewBindings.findChildViewById(rootView, id);
      if (webView == null) {
        break missingId;
      }

      return new FragmentWidgetsBinding((ConstraintLayout) rootView, calendarView, divider,
          divider2, imageView, progressBar, progressBar2, ratingBar, searchView, seekBar, seekBar2,
          surfaceView, textureView, videoView, view, webView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
