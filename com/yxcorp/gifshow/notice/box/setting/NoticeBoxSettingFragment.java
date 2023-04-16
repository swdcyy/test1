package com.yxcorp.gifshow.notice.box.setting.NoticeBoxSettingFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ltb.e;
import jtb.b;

public class NoticeBoxSettingFragment extends BaseFragment	// class@002184
{
    public b j;
    public PresenterV2 k;
    public static final int l;

    public void NoticeBoxSettingFragment(){
       super();
    }
    public int M(){
       return 1;
    }
    public String o(){
       return "NOTIFICATION_SETTING";
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, NoticeBoxSettingFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d10b6, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, NoticeBoxSettingFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       NoticeBoxSettingFragment tk = this.k;
       if (tk != null) {
          tk.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NoticeBoxSettingFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       if (this.k == null) {
          String str = "5";
          e uoe = PatchProxy.applyWithListener(objArray, this, NoticeBoxSettingFragment.class, str);
          if (uoe != patchProxyRe) {
          }else {
             uoe = new e();
             PatchProxy.onMethodExit(NoticeBoxSettingFragment.class, str);
          }
          this.k = uoe;
       }
       this.k.f(p0);
       NoticeBoxSettingFragment tk = this.k;
       Object[] objArray1 = new Object[1];
       NoticeBoxSettingFragment noticeBoxSet = PatchProxy.apply(objArray, this, NoticeBoxSettingFragment.class, "4");
       if (noticeBoxSet != patchProxyRe) {
       }else if(this.j == null){
          this.j = new b(this);
       }
       noticeBoxSet = this.j;
       objArray1[0] = noticeBoxSet;
       tk.i(objArray1);
       return;
    }
}
