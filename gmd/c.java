package gmd.c;
import ln6.a;
import java.lang.Object;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import android.widget.FrameLayout;
import android.view.View;
import android.graphics.Rect;
import brd.t;
import ln6.c;
import mn6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i;
import hmd.d;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f;
import android.content.Context;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import jn6.b;
import com.kwai.gifshow.post.api.feature.vote.model.VoteInfo;
import jn6.c;
import w46.b;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteView;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.InteractStickerWrapperView;
import java.lang.Throwable;
import java.lang.StringBuilder;
import imd.b;
import jmd.b;
import psb.e;
import psb.f;
import cjd.e;
import erd.o;
import gmd.b;
import gmd.a;

public class c implements a	// class@000f4f
{

    public void c(){
       super();
    }
    public a RB(Activity p0,BaseFeed p1,FrameLayout p2,View p3,Rect p4,t p5,View p6,c p7,int p8){
       Object[] objArray;
       object oobject = p1;
       int i = p8;
       c uoc = c.class;
       int i1 = 0;
       int i2 = 2;
       int i3 = 1;
       if (PatchProxy.isSupport(uoc)) {
          objArray = new Object[9];
          objArray[i1] = p0;
          objArray[i3] = oobject;
          objArray[i2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = Integer.valueOf(p8);
          Object obj = PatchProxy.apply(objArray, this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       objArray = new Object[i2];
       objArray[i1] = Integer.valueOf(p8);
       objArray[i3] = oobject;
       a.D().w("InteractStickerViewPluginImpl", "newInteractStickerViewHelperInstance: type = [%s], photo = [$s]", objArray);
       if (i == i3) {
          i oi = new i(p0, p1, p2, p3, p4, p5, p6, p7);
          return v10;
       }else {
          d uod = this.m70(i, p1);
          if (uod == null) {
             return null;
          }else {
             f uof = new f(p0, p1, p2, p3, p4, p5, p6, uod);
             return v10;
          }
       }
    }
    public b b00(Context p0,int p1,InteractStickerInfo p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(p1),p2};
       a.D().w("InteractStickerViewPluginImpl", "newInteractStickerViewInstance: type = [%s], data = [$s]", objArray);
       if (p1 == 1) {
          VoteInfo voteInfo = c.f(p2);
          if (voteInfo == null) {
             Object[] objArray1 = new Object[0];
             a.D().t("InteractStickerViewPluginImpl", "getVoteInfo error", objArray1);
             return null;
          }else {
             VoteView voteView = new VoteView(p0);
             voteView.c(voteInfo, 0, 0);
             return voteView;
          }
       }else {
          d uod = this.m70(p1, null);
          if (uod == null) {
             return null;
          }else {
             return uod.d(null, p0, p2);
          }
       }
    }
    public boolean isAvailable(){
       return true;
    }
    public final d m70(int p0,BaseFeed p1){
       Object[] obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                obj = new Object[0];
                a.D().t("InteractStickerViewPluginImpl", "不支持的贴纸类型:"+p0, obj);
                return null;
             }else {
                return new b(p1);
             }
          }else {
             return new b(p1);
          }
       }else {
          obj = new Object[0];
          a.D().t("InteractStickerViewPluginImpl", "老投票没有做兼容:"+p0, obj);
          return null;
       }
    }
    public t pR(int p0,BaseFeed p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0),p1};
       a.D().w("InteractStickerViewPluginImpl", "interactStickerResult: type = [%s], photo = [$s]", objArray);
       if (p0 == 1) {
          return f.a().e(p1.getId()).map(new e()).map(b.b);
       }else {
          d uod = this.m70(p0, p1);
          if (uod == null) {
             return null;
          }else {
             return uod.getData().map(a.b);
          }
       }
    }
}
