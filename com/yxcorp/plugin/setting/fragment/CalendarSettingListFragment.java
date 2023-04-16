package com.yxcorp.plugin.setting.fragment.CalendarSettingListFragment;
import com.yxcorp.plugin.setting.fragment.SettingListFragment;
import java.lang.String;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;

public final class CalendarSettingListFragment extends SettingListFragment	// class@0008ac
{
    public HashMap t;

    public void CalendarSettingListFragment(){
       super();
    }
    public int getPage(){
       return 0;
    }
    public String o(){
       return "CALENDAR_REMIND";
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, CalendarSettingListFragment.class, "2")) {
       }else {
          CalendarSettingListFragment tt = this.t;
          if (tt != null) {
             tt.clear();
          }
       }
       return;
    }
}
