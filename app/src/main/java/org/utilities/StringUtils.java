package org.utilities;

import androidx.annotation.Nullable;

public class StringUtils {

  /** test commit */
  public static boolean isEmptyOrNull(@Nullable final CharSequence value) {

    // xxx
    return value == null
        || value.length() == 0;
  }
}
