package com.yxcorp.gifshow.photo.download.task.n0$a;
import erd.o;
import com.yxcorp.gifshow.photo.download.task.n0;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import com.yxcorp.gifshow.photo.download.task.DownloadRedPacketHelper;
import wkd.b;
import zwb.a;
import com.yxcorp.gifshow.photo.download.task.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.QCurrentUser;
import brd.t;
import jxb.i;

public class n0$a implements o	// class@000f0c
{
    public final n0 b;

    public void n0$a(n0 p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       boolean b;
       t ot = PatchProxy.applyOneRefs(p0, this, n0$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else if(p0.booleanValue() && this.b.o.d()){
          b = true;
       }else {
          b = false;
       }
       Boolean uBoolean = Boolean.valueOf(b);
       int i = 0;
       b = this.b;
       n0 o = b.o;
       int i1 = -258426948;
       if (o.b != null) {
          i = (o.d())? 1: 2;
          ot = b.a(i1).d(this.b.b.getPhotoId(), QCurrentUser.ME.getId(), this.b.b.getSource(), uBoolean, i);
       }else {
          ot = i.d(b.b);
          if (ot == null) {
             ot = b.a(i1).d(this.b.b.getPhotoId(), QCurrentUser.ME.getId(), this.b.b.getSource(), uBoolean, i);
          }
       }
       return ot;
    }
}
