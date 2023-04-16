package com.yxcorp.plugin.setting.fragment.SettingListFragment;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;

public class SettingListFragment extends EntryListFragment	// class@0008af
{

    public void SettingListFragment(){
       super();
    }
    public int M(){
       return 1;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SettingListFragment.class, "1")) {
          return;
       }
       super.doBindView(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, SettingListFragment.class, "2")) {
          TextView textView = p0.findViewById(R.id.title_tv);
          if (textView != null) {
             ViewGroup$LayoutParams layoutParams = textView.getLayoutParams();
             if (layoutParams instanceof RelativeLayout$LayoutParams) {
                layoutParams.addRule(1, 0);
                layoutParams.addRule(0, 0);
             }
          }
       }
       return;
    }
    public int getPage(){
       return 5;
    }
    public String getUrl(){
       return "ks://settings";
    }
}
