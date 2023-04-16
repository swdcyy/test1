package com.yxcorp.gifshow.childprotect.fragment.ChildProtectSettingListFragment;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.trello.rxlifecycle3.components.support.RxFragment;
import k2b.e0;
import bk9.a;
import android.os.Bundle;

public class ChildProtectSettingListFragment extends EntryListFragment	// class@001089
{
    public boolean t;
    public static final int u;

    public void ChildProtectSettingListFragment(){
       super();
       this.t = true;
    }
    public int M(){
       return 1;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildProtectSettingListFragment.class, "5")) {
          return;
       }
       super.doBindView(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, ChildProtectSettingListFragment.class, "6")) {
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
    public String o(){
       return "CHILD_PROTECT_TOOLS_LIST";
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ChildProtectSettingListFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       a.b("LEAVE", this);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, ChildProtectSettingListFragment.class, "3")) {
          return;
       }
       super.onResume();
       if (this.t == null) {
          a.b("RESUME", this);
       }
       this.t = false;
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ChildProtectSettingListFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       a.b("ENTER", this);
       return;
    }
}
