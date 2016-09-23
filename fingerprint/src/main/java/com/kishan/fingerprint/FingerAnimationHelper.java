package com.kishan.fingerprint;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;

/**
 * Created by DSK02 on 9/23/2016.
 */

public class FingerAnimationHelper {
  private Context context;
  private ImageView imageView;
  private AnimatedVectorDrawable showFingerprint;
  private AnimatedVectorDrawable scanFingerprint;
  private AnimatedVectorDrawable fingerprintToTick;
  private AnimatedVectorDrawable fingerprintToCross;

  public FingerAnimationHelper(Context context, ImageView imageView) {
    this.context = context;
    this.imageView = imageView;
    showFingerprint =
        (AnimatedVectorDrawable) ContextCompat.getDrawable(context, R.drawable.show_fingerprint);
    scanFingerprint =
        (AnimatedVectorDrawable) ContextCompat.getDrawable(context, R.drawable.scan_fingerprint);
    fingerprintToTick =
        (AnimatedVectorDrawable) ContextCompat.getDrawable(context, R.drawable.fingerprint_to_tick);
    fingerprintToCross = (AnimatedVectorDrawable) ContextCompat.getDrawable(context,
        R.drawable.fingerprint_to_cross);
  }

  public void showFingerPrint() {
    imageView.setImageDrawable(showFingerprint);
    showFingerprint.start();
  }

  public void scanFingerPrint() {
    imageView.setImageDrawable(scanFingerprint);
    scanFingerprint.start();
  }

  public void fingerprintToTick() {
    imageView.setImageDrawable(fingerprintToTick);
    fingerprintToTick.start();
  }

  public void setFingerprintToCross() {
    imageView.setImageDrawable(fingerprintToCross);
    fingerprintToCross.start();
  }
}
