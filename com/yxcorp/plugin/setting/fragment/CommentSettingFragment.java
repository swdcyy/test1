package com.yxcorp.plugin.setting.fragment.CommentSettingFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.setting.presenter.o;
import com.yxcorp.plugin.setting.presenter.a;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import lu7.f;
import pgd.y;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Bundle;
import lnc.g2;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ggd.i;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import ogd.b;
import android.view.View$OnClickListener;
import androidx.fragment.app.FragmentActivity;
import k2b.e0;
import sgd.b;

public class CommentSettingFragment extends BaseFragment implements g2$a	// class@0008ad
{
    public KwaiActionBar j;
    public g2 k;
    public i l;
    public PresenterV2 m;
    public static final int n;

    public void CommentSettingFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CommentSettingFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       this.m = obj;
       obj.U7(new o());
       this.m.U7(new a());
       PatchProxy.onMethodExit(CommentSettingFragment.class, "6");
       return this.m;
    }
    public int M(){
       return 1;
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, CommentSettingFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getPageParams();
       String str = "comment_status="+y.b(f.k(QCurrentUser.ME));
       String str1 = "gift_send_status="+(QCurrentUser.ME.isAllowPushMyCommentsToOther() ^ 0x01);
       if (TextUtils.x(obj)) {
          return obj;
       }
       return obj+"&"+str+"&"+str1;
    }
    public String getUrl(){
       return "ks://settings";
    }
    public String o(){
       return "COMMENT_PRIVACY_SETTING";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentSettingFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.k = new g2(this, this);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CommentSettingFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d01d4, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommentSettingFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       CommentSettingFragment tk = this.k;
       if (tk != null) {
          CommentSettingFragment uCommentSett = PatchProxy.apply(null, this, CommentSettingFragment.class, "4");
          if (uCommentSett != PatchProxyResult.class) {
          }else if(this.l == null){
             this.l = new i(this);
          }
          uCommentSett = this.l;
          tk.b(uCommentSett);
       }
       KwaiActionBar kwaiActionBa = m1.f(p0, R.id.title_root);
       this.j = kwaiActionBa;
       kwaiActionBa.i(R.drawable.arg_RES_7f0819d9);
       this.j.q(R.string.arg_RES_7f1007b6);
       m1.a(p0, new b(this), R.id.left_btn);
       b.g(this.getActivity(), y.b(f.k(QCurrentUser.ME)), (QCurrentUser.ME.isAllowPushMyCommentsToOther() ^ 0x01));
       return;
    }
}
