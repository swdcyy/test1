package com.yxcorp.gifshow.record.album.k1;
import erd.o;
import java.lang.Object;
import java.util.List;
import com.kwai.sdk.switchconfig.a;
import m8c.f;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.System;
import java.util.Iterator;
import m8c.e;
import com.yxcorp.gifshow.record.album.model.d;
import k8c.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.m$k0;
import q87.c;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.c;
import o56.a;
import xf6.l;
import com.yxcorp.gifshow.edit.draft.model.b0;
import android.util.Pair;
import com.kwai.gifshow.post.api.feature.popup.BubbleEnterPostParam;
import java.io.File;
import java.lang.Integer;
import brd.t;
import com.kuaishou.edit.draft.Workspace$Type;

public final class k1 implements o	// class@00172f
{
    public static final k1 b;

    static {
       k1.b = new k1();
    }
    public void k1(){
       super();
    }
    public final Object apply(Object p0){
       e uoe;
       boolean b;
       int i;
       Object[] objArray1;
       t ot;
       f value = a.t().getValue("localAlbumReminderSettings", f.class, new f());
       long l = (long)value.draftReminderMinTime;
       long l1 = (long)value.draftReminderMaxTime;
       long l2 = 1000;
       long l3 = System.currentTimeMillis();
       long l4 = l3 - ((((l * 24) * 60) * 60) * l2);
       l3 = l3 - ((((24 * l1) * 60) * 60) * l2);
       Iterator iterator = p0.iterator();
       while (true) {
          String str = "LocalAlbumUtils";
          if (iterator.hasNext()) {
             uoe = iterator.next();
             if (uoe instanceof d) {
                Object[] objArray = new Object[0];
                a.D().w(str, "isActiveSaveLocalAlbum = "+uoe.k().d1().F().b.s0+" x = "+l+" y = "+l1+" minModifiedTime = "+l3+" maxModifiedTime = "+l4+" lastModifiedTime = "+uoe.i(), objArray);
                Object obj = PatchProxy.apply(null, null, LocalAlbumUtils.class, "35");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                   i = 0;
                }else if(a.a().c()){
                   i = false;
                   if (l.c("key_default_return_the_first_one", i)) {
                      b = true;
                   }
                }else {
                   i = 0;
                }
                b = false;
                if (b) {
                   objArray1 = new Object[i];
                   a.D().w(str, "default return the first one", objArray1);
                }else {
                   if (b0.b(uoe.getIdentifier()) || (uoe.k().d1().F().b.s0 == null || (uoe.i() - l3 < 0 || uoe.i() - l4 > 0))) {
                      continue ;
                   }
                }
             }
          }else {
             uoe = null;
          }
          if (uoe == null) {
             Object[] objArray2 = new Object[0];
             a.D().w(str, "match draft does not exist", objArray2);
             LocalAlbumUtils.a = "";
             ot = t.just(new Pair(new BubbleEnterPostParam(1, null, null), Integer.valueOf(-100)));
             break ;
          }else {
             objArray1 = new Object[0];
             a.D().w(str, "has found match draft", objArray1);
             LocalAlbumUtils.a = uoe.getDirectory().toString();
             BubbleEnterPostParam uBubbleEnter = new BubbleEnterPostParam(1, uoe.getIdentifier(), uoe.getCoverFile(), uoe.k().V0(), Integer.valueOf(uoe.getType().getNumber()));
             ot = t.just(new Pair(l4, Integer.valueOf(1)));
             break ;
          }
       }
       return ot;
    }
}
