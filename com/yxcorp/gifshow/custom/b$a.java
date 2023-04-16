package com.yxcorp.gifshow.custom.b$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.custom.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import oa0.a;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import pt9.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import ow8.c;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.s6;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.custom.ShareCustomFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;

public class b$a extends m	// class@00129d
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       SharedPreferences$Editor uEditor;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       this.c.q.setVisibility(8);
       boolean b = false;
       if (a.h0() && (b.c(this.c.s) || (b.b(this.c.t) && b.d()))) {
          uEditor = a.a.edit();
          uEditor.putBoolean("new_publish_page_label_display_tip", b);
          g.a(uEditor);
       }else if(a.g0()){
          a.s1(b);
       }else if(c.a() && (a.i0() && (b.f(this.c.t) || b.a(this.c.A)))){
          uEditor = a.a.edit();
          uEditor.putBoolean("new_publish_page_recreation_tip", b);
          g.a(uEditor);
       }else if(s6.d() && a.j0()){
          uEditor = a.a.edit();
          uEditor.putBoolean("new_publish_page_watermark_tip", b);
          g.a(uEditor);
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, a.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MORE_SETTING";
          u1.u(1, uElementPack, objArray);
       }
       new ShareCustomFragment().Cb(this.c.v.getSupportFragmentManager(), "customFragment");
       return;
    }
}
