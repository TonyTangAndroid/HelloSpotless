package com.uber.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

@SuppressWarnings("UnusedVariable") // This is sample code
public class MainFragment extends Fragment {

  @NonNull private Object onAttachInitialisedField;
  @NonNull private Object mOnCreateViewInitialisedField;
  @NonNull private Object mOnCreateInitialisedField;

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mOnCreateInitialisedField = new Object();
  }

  @Nullable
  @Override
  public View onCreateView(
      @NonNull LayoutInflater inflater,
      @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    mOnCreateViewInitialisedField = new Object();
    return super.onCreateView(inflater, container, savedInstanceState);
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    onAttachInitialisedField = new Object();
    // I have three more empty line after this comment before I commit the code.
    // Then due to Google Java Format Github hooks, it will only keep one line.
    // This confirms that Google Java Format works.

    // end test
  }

  private int test() {
    throw new RuntimeException();
  }
}
