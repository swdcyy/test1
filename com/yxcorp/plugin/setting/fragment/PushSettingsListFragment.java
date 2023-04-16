package com.yxcorp.plugin.setting.fragment.PushSettingsListFragment;
import com.yxcorp.plugin.setting.fragment.SettingListFragment;
import android.view.View;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import android.widget.ScrollView;
import ogd.c;
import java.lang.Runnable;

public class PushSettingsListFragment extends SettingListFragment	// class@0008ae
{
    public ScrollView t;

    public void PushSettingsListFragment(){
       super();
    }
    public int M(){
       return 1;
    }
    public int getPage(){
       return 64;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PushSettingsListFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.getActivity().getIntent() != null && j0.a(this.getActivity().getIntent(), "KEY_NOTIFICATION_SETTING_SCROLL_TO_BOTTOM", false)) {
          ScrollView scrollView = this.getActivity().findViewById(R.id.scroll_container);
          this.t = scrollView;
          scrollView.post(new c(this));
       }
       return;
    }
}
