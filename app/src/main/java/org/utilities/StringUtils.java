package org.utilities;

import androidx.annotation.Nullable;

public class StringUtils {

  // test
  public static boolean isEmptyOrNull(@Nullable final CharSequence value) {

    return value == null || value.length() == 0;
  }
}
