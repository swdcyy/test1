package eja.s1$a;
import o26.c;
import eja.s1;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import o26.b;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.kwai.kcube.TabIdentifier;
import com.google.common.collect.ImmutableList;
import r26.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import vja.b;
import on5.b;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.android.model.mix.Location;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import kp.w1;
import tkd.b;
import tkd.d;
import xw5.c;
import brd.t;
import eja.s1$a$a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class s1$a implements c	// class@0026f5
{
    public final s1 b;

    public void s1$a(s1 p0){
       this.b = p0;
       super();
    }
    public void Dc(QPhoto p0){
       b.a(this, p0);
    }
    public void S9(){
       b.b(this);
    }
    public void tc(PostStatus p0,int p1,float p2,TabIdentifier p3){
       b.c(this, p0, p1, p2, p3);
    }
    public final void u4(ImmutableList p0,a p1,boolean p2){
       Object obj;
       if (PatchProxy.isSupport(s1$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, s1$a.class, "1")) {
          return;
       }
       if (this.b.P8()) {
          return;
       }
       a.o(p1, "info");
       if (a.g(b.e(p1), b.c) && (p1.getStatus() == PostStatus.UPLOAD_COMPLETE && (this.b.R8() && p0 != null))) {
          Iterator iterator = p0.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj = iterator.next();
                Object obj1 = obj;
                a.o(obj1, "it");
                obj1 = (obj1.getPostWorkInfoId() == p1.getId())? 1: null;
                if (!obj1) {
                   continue ;
                }
             }else {
                obj = null;
             }
             if (obj != null && obj.getLocation() != null) {
                String photoId = obj.getPhotoId();
                a.o(photoId, "it.photoId");
                Location location = obj.getLocation();
                a.o(location, "it.location");
                this.b.X7(d.a(0x1e777b83).Mr(photoId, location.getId(), w1.r(obj.getEntity()).toInt()).subscribe(new s1$a$a(obj, this), Functions.e));
                break ;
             }
          }
       }
    label_00b6 :
       return;
    }
}
