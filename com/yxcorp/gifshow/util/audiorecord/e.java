package com.yxcorp.gifshow.util.audiorecord.e;
import com.yxcorp.gifshow.util.audiorecord.a$d;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecordPanel;
import java.lang.Object;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import nnc.j;
import java.lang.Runnable;
import android.app.Activity;

public final class e implements a$d	// class@001f55
{
    public final FragmentAudioRecordPanel a;

    public void e(FragmentAudioRecordPanel p0){
       this.a = p0;
    }
    public final void a(boolean p0){
       e ta = this.a;
       ta.getActivity().runOnUiThread(new j(ta, p0));
    }
}
