package com.yxcorp.gifshow.magic.ui.magicemoji.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.magic.ui.magicemoji.StandardMagicFaceFragment;
import java.lang.Object;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.util.List;
import java.lang.String;
import xf6.g;
import u4b.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.StringBuilder;
import wkd.b;
import j80.c;
import java.io.File;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import com.yxcorp.gifshow.model.PassThroughParams;
import g9c.a;
import s5b.b;
import q87.c;
import m4b.x0;
import ekd.k1;

public final class f implements Runnable	// class@001bcc
{
    public final StandardMagicFaceFragment b;
    public final boolean c;

    public void f(StandardMagicFaceFragment p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       MagicFaceFragment l;
       List list;
       f tb = this.b;
       f tc = this.c;
       if (tb.A == 3) {
          l = tb.l;
          if (l != null) {
             list = tb.Ah(l.mMagicFaces, l.mId);
          }else {
             list = tb.t;
          }
       }else {
          int i = 0;
          if (g.J()) {
             MagicFaceFragment l1 = tb.l;
             if (l1 != null && l1.mTabType == 7) {
                list = PatchProxy.apply(null, null, e.class, "2");
                if (list != PatchProxyResult.class) {
                }else {
                   list = new ArrayList();
                   File uFile = new File(b.a(-1504323719).k()+File.separator+"local_test_magic_faces");
                   if (uFile.exists()) {
                      File[] uFileArray = uFile.listFiles();
                      int len = uFileArray.length;
                      int i1 = 0;
                      while (i < len) {
                         object oobject = uFileArray[i];
                         if (new File(oobject.getPath(), "/params.txt").exists()) {
                            MagicEmoji$MagicFace magicFace = new MagicEmoji$MagicFace();
                            magicFace.mName = oobject.getName();
                            int i2 = i1 + 1;
                            magicFace.mId = String.valueOf(i1);
                            magicFace.mResourceType = 13;
                            magicFace.mResource = oobject.getPath();
                            magicFace.mImage = "test";
                            magicFace.mExtraParams = new MagicFaceExtraParams();
                            magicFace.mPassThroughParams = new PassThroughParams();
                            list.add(magicFace);
                            i1 = i2;
                         }
                         i = i + 1;
                      }
                   }
                }
             }
          }
          if (tc != null || tb.s.R0()) {
             l = tb.l;
             list = (l != null)? tb.mh(l.mMagicFaces): tb.t;
             Object[] objArray = new Object[i];
             b.D().w("MagicFaceFragment", tb.u+" force update", objArray);
          }else {
          label_0100 :
             return;
          }
       }
       k1.o(new x0(tb, list));
       goto label_0100 ;
    }
}
