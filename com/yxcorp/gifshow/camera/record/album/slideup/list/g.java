package com.yxcorp.gifshow.camera.record.album.slideup.list.g;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.album.slideup.list.h;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import vb9.m;
import com.yxcorp.gifshow.camera.record.base.b;
import ee9.a;
import oh9.a3;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lq.i;
import lq.e;
import java.util.List;
import com.yxcorp.gifshow.models.QMedia;
import bn8.a;
import android.content.SharedPreferences;
import android.view.View;
import com.yxcorp.gifshow.camera.record.album.slideup.list.f;
import android.view.ViewGroup;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;

public final class g implements Runnable	// class@001cda
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void run(){
       Object[] objArray2;
       boolean b1;
       int i;
       g tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, tb, oh, "10");
       boolean b = true;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(tb.w == null){
          tb.w = false;
          Object[] objArray1 = new Object[false];
          a.D().w("AlbumToolController", "autoExpandAlbumList", objArray1);
          if (!tb.g2()) {
             objArray2 = new Object[false];
             a.D().w("AlbumToolController", "isMediaListEnabled is false.", objArray2);
          }else {
             Object obj1 = PatchProxy.apply(objArray, tb, oh, "11");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(tb.d.d(m.d).c != null){
                objArray2 = new Object[false];
                a.D().s("AlbumToolController", "isEnableAutoShowByExtra, isInterceptSlideUp", objArray2);
             }else if(tb.d.d(a.g).a()){
                objArray2 = new Object[false];
                a.D().s("AlbumToolController", "isEnableAutoShowByExtra, hasValidMagicFace", objArray2);
             }else if(tb.d.d(a3.d).a != null){
                objArray2 = new Object[false];
                a.D().s("AlbumToolController", "isEnableAutoShowByExtra, WorkspaceData.mIsRecover", objArray2);
             }else {
                Intent intent = tb.e.getIntent();
                if (j0.g(intent, "music")) {
                   objArray2 = new Object[false];
                   a.D().s("AlbumToolController", "isEnableAutoShowByExtra, has Music", objArray2);
                }else if(!TextUtils.x(j0.f(intent, "musicId"))){
                   i = -1;
                   if (j0.b(intent, "musicType", i) != i) {
                      objArray2 = new Object[false];
                      a.D().s("AlbumToolController", "isEnableAutoShowByExtra, has Music id", objArray2);
                   }
                }
                if (j0.g(intent, "key_post_entrance_draft_params")) {
                   objArray2 = new Object[false];
                   a.D().s("AlbumToolController", "isEnableAutoShowByExtra, has draft", objArray2);
                }else if(j0.a(intent, "showFlashPopupOnCameraPage", false)){
                   objArray2 = new Object[false];
                   a.D().s("AlbumToolController", "isEnableAutoShowByExtra, has kuaishan popup", objArray2);
                }else if(i.h() && !TextUtils.x(i.m().k().b())){
                   objArray2 = new Object[false];
                   a.D().s("AlbumToolController", "isEnableAutoShowByExtra, has activityId", objArray2);
                }else {
                   b1 = true;
                }
             }
             b1 = false;
             if (b1) {
                if (tb.x != null && tb.u.get(false).mModified - a.a.getLong("last_show_album_list_latest_time", 0) <= 0) {
                   objArray2 = new Object[false];
                   a.D().w("AlbumToolController", "no new photo", objArray2);
                }else {
                   tb.q.setVisibility(false);
                   tb.r.post(new f(tb));
                }
             }
          }
       }
       b = false;
       if (!b && tb.d.b().V7() != null) {
          tb.d.b().V7().u(RecordBubbleItem.AUTO_SHOW_ALBUM_TOOL);
       }
       return;
    }
}
