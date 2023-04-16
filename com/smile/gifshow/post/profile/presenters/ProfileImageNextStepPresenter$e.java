package com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$e;
import x79.g;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import kotlin.jvm.internal.a;
import x79.g$a;
import android.net.Uri;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.graphics.Bitmap;
import ym8.f;
import ym8.e;
import java.util.ArrayList;
import tkd.b;
import tkd.d;
import voc.m;
import java.util.List;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.RectInfo;
import android.util.Pair;
import android.content.Intent;

public final class ProfileImageNextStepPresenter$e implements g	// class@000c75
{
    public final ProfileImageNextStepPresenter a;

    public void ProfileImageNextStepPresenter$e(ProfileImageNextStepPresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void b(Throwable p0){
       a.p(p0, "e");
       g$a.b(this, p0);
    }
    public void c(int p0,int p1,Uri p2){
       a.p(p2, "saveUri");
       if (!PatchProxy.isSupport(g$a.class) || !PatchProxy.applyVoidFourRefs(this, Integer.valueOf(p0), Integer.valueOf(p1), p2, null, g$a.class, "1")) {
          a.p(p2, "saveUri");
       }
       return;
    }
    public boolean d(Bitmap p0){
       e e;
       e d;
       a.p(p0, "corpBitmap");
       f uof = ProfileImageNextStepPresenter.R8(this.a);
       if (!uof instanceof e) {
          uof = null;
       }
       if (uof != null) {
          a.p(p0, "bitmap");
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(p0);
          b uob = d.a(0x27ab2faf);
          e = uof.e;
          d = uof.d;
          String str = "mCropActivity";
          if (d == null) {
             a.S(str);
          }
          Pair pair = uob.wJ(e, uArrayList, d, uof.f, "ALBUM_SOURCE", uof.g, uof.h, false, null, null);
          e d1 = uof.d;
          if (d1 == null) {
             a.S(str);
          }
          d1.startActivity(pair.first);
       }
       return true;
    }
}
