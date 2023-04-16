package com.yxcorp.gifshow.v3.editor.music_v2.utils.b;
import erd.g;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.g$a;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import trc.g;
import lsc.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.io.File;
import zsd.u;
import brd.a0;
import lsc.y;
import voc.a0;
import erd.o;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.c;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.d;
import crd.b;
import lsc.x;
import com.kwai.video.editorsdk2.RemuxTask;
import android.view.View$OnClickListener;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.e;
import o79.i;
import e17.i;

public final class b implements g	// class@001126
{
    public final FragmentActivity b;
    public final ProgressFragment c;

    public void b(FragmentActivity p0,ProgressFragment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b tc = this.c;
       g$a a = p0.a;
       g$a b = p0.b;
       int i = (int)a;
       boolean b1 = false;
       int i1 = 0x7f101654;
       String str = 0x7f11066a;
       if (i != -2) {
          if (i != -1) {
             if (i) {
                int i2 = 100;
                if (i != i2) {
                   if (0 - a > 0 || (a - 100 < 0 && tc.isAdded())) {
                      tc.Fh(i, i2, true);
                   }
                }else if(TextUtils.x(p0.a())){
                   g og = new g();
                   str = p0.a();
                   String obj = PatchProxy.applyOneRefs(str, null, u.class, "10");
                   if (obj != PatchProxyResult.class) {
                      str = obj;
                   }else {
                      a.p(str, "mp4Path");
                      File uFile = new File(str);
                      if (uFile.exists()) {
                         obj = u.g2(str, ".mp4", ".mp3", false, 4, null);
                         if (uFile.renameTo(new File(obj))) {
                            str = obj;
                         }
                      }
                   }
                   og.load().u(new y(str, p0.e, p0.c, og)).G(d.a).R(new c(tc, og, tb), d.b);
                }
             }else if(tb != null && !tc.isAdded()){
                tc.xh(new x(b));
                p0 = tb.getSupportFragmentManager().beginTransaction();
                p0.h(tc, "export_music");
                p0.m();
             }
          }else if(tc.isAdded()){
             tc.dismissAllowingStateLoss();
          }
          e.d(b1, tb);
          i.d(str, i.p(i1));
       }else if(tc.isAdded()){
          tc.dismissAllowingStateLoss();
       }
       i.e(str, i.p(i1), 4000);
       e.d(b1, tb);
    label_00f2 :
       return;
    }
}
