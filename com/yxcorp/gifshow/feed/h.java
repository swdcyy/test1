package com.yxcorp.gifshow.feed.h;
import java.lang.Object;
import com.kwai.component.feedstaggercard.model.CardStyle;
import android.view.View;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewStub;
import tkd.b;
import tkd.d;
import lv5.c;
import lv5.b;
import android.view.ViewGroup;
import a1.a;
import a1.a$e;
import android.content.Context;
import zea.r;
import msd.l;
import a1.c;

public class h	// class@000ff7
{

    public void h(){
       super();
    }
    public static void a(CardStyle p0,View p1,PhotoItemViewParam p2){
       ViewStub viewStub;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, h.class, "1")) {
          return;
       }
       p0 = p0.mBottomType;
       if (p0 == 7 && p2.mEnableLocalNewV4UI != null) {
          if (!PatchProxy.applyVoidOneRefs(p1, null, h.class, "5")) {
             viewStub = p1.findViewById(R.id.feed_cover_nearby_bottom_part_stub);
             if (viewStub != null) {
                viewStub.inflate();
             }
          }
       }else {
          int i = -242212848;
          int i1 = 4;
          if (p0 == i1) {
             if (!PatchProxy.applyVoidOneRefs(p1, null, h.class, "4")) {
                viewStub = p1.findViewById(R.id.feed_cover_follow_bottom_part_view_stub_v1);
                if (viewStub != null) {
                   viewStub.setLayoutResource(d.a(i).T40(i1));
                   viewStub.inflate();
                }
             }
          }else if(p0 == 5){
             if (!PatchProxy.applyVoidOneRefs(p1, null, h.class, "6")) {
                viewStub = p1.findViewById(R.id.feed_cover_follow_bottom_part_v5_stub);
                if (viewStub != null) {
                   viewStub.setLayoutResource(d.a(i).T40(5));
                   viewStub.inflate();
                }
             }
          }else if(p0 == 8){
             if (!PatchProxy.applyVoidOneRefs(p1, null, h.class, "7")) {
                viewStub = p1.findViewById(R.id.feed_cover_find_v6_bottom_part_stub);
                if (viewStub != null) {
                   viewStub.inflate();
                }
             }
          }else if(PatchProxy.applyVoidOneRefs(p1, null, h.class, "3")){
             viewStub = p1.findViewById(R.id.feed_cover_normal_bottom_part_view_stub);
             if (viewStub != null) {
                viewStub.inflate();
             }
          }
       }
       return;
    }
    public static void b(ViewGroup p0,CardStyle p1,PhotoItemViewParam p2,a p3,a$e p4){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, oh, "2")) {
             return;
          }
       }
       c.a(p3, p0.getContext(), new r(p1, p2));
       p3.b(R.layout.arg_RES_7f0d093e, p0, p4);
       return;
    }
}
