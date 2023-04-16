package com.facebook.imagepipeline.producers.r$a;
import id.k;
import com.facebook.imagepipeline.producers.r;
import id.i;
import id.c0;
import ld.d;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Boolean;
import com.facebook.imagepipeline.producers.r$a$a;
import com.facebook.imagepipeline.producers.JobScheduler;
import java.util.concurrent.Executor;
import com.facebook.imagepipeline.producers.JobScheduler$d;
import com.facebook.imagepipeline.producers.r$a$b;
import id.d0;
import java.lang.Object;
import bd.d;
import id.b;
import com.facebook.imageformat.a;
import ld.c;
import ab.e;
import com.facebook.common.util.TriState;
import uc.e;
import ld.e;
import java.lang.Integer;
import java.util.ArrayList;
import uc.d;
import nc.a;
import ld.b;
import java.lang.String;
import java.util.Map;
import id.e0;
import java.lang.StringBuilder;
import java.util.HashMap;
import com.facebook.common.internal.ImmutableMap;

public class r$a extends k	// class@001146
{
    public final boolean c;
    public final d d;
    public final c0 e;
    public boolean f;
    public final JobScheduler g;
    public final r h;

    public void r$a(r p0,i p1,c0 p2,boolean p3,d p4){
       this.h = p0;
       super(p1);
       this.f = false;
       this.e = p2;
       ImageRequest s = p2.b().s;
       if (s != null) {
          p3 = s.booleanValue();
       }
       this.c = p3;
       this.d = p4;
       this.g = new JobScheduler(p0.a, new r$a$a(this, p0), 100);
       p2.k(new r$a$b(this, p0, p1));
       return;
    }
    public void i(Object p0,int p1){
       TriState uNSET;
       boolean b1;
       if (this.f != null) {
       }else {
          boolean b = b.e(p1);
          int i = 1;
          if (p0 == null) {
             if (b) {
                this.n().d(null, i);
             }
          }else {
             a uoa = p0.j();
             ImageRequest imageRequest = this.e.b();
             c uoc = this.d.createImageTranscoder(uoa, this.c);
             e.d(uoc);
             if (p0.j() == a.c) {
                uNSET = TriState.UNSET;
             }else if(!uoc.b(p0.j())){
                uNSET = TriState.NO;
             }else {
                e uoe1 = imageRequest.q();
                if (!uoe1.b()) {
                   if (!e.b(uoe1, p0)) {
                      if (!uoe1.f() || uoe1.b()) {
                         p0.f = 0;
                         b1 = false;
                      }else {
                         b1 = e.a.contains(Integer.valueOf(p0.g()));
                      }
                      if (!b1) {
                      label_007c :
                         uoe1 = null;
                      label_007d :
                         if (!uoe1 && !uoc.a(p0, imageRequest.q(), imageRequest.p())) {
                            i = false;
                         }
                         uNSET = TriState.valueOf(i);
                      }
                   }
                   uoe1 = 1;
                   goto label_007d ;
                }else {
                   goto label_007c ;
                }
             }
             if (b || uNSET != TriState.UNSET) {
                if (uNSET != TriState.YES) {
                   if (uoa == a.a || uoa == a.k) {
                      if (!this.e.b().q().b() && (p0.l() && p0.l() != -1)) {
                         p0 = this.o(p0, 0);
                      }
                   }else {
                      e uoe = this.e.b().q();
                      if (!uoe.g() && uoe.f()) {
                         p0 = this.o(p0, uoe.e());
                      }
                   }
                   this.n().d(p0, p1);
                }else if(this.g.g(p0, p1) && (b || this.e.i())){
                   this.g.e();
                }
             }
          }
       }
       return;
    }
    public final d o(d p0,int p1){
       p0 = d.a(p0);
       if (p0 != null) {
          p0.C(p1);
       }
       return p0;
    }
    public final Map p(d p0,d p1,b p2,String p3){
       if (!this.e.l().requiresExtraMap(this.e, "ResizeAndRotateProducer")) {
          return null;
       }
       String str = "x";
       String str1 = p0.getWidth()+str+p0.getHeight();
       String str2 = (p1 != null)? p1.a+str+p1.b: "Unspecified";
       HashMap hashMap = new HashMap();
       hashMap.put("Image format", String.valueOf(p0.j()));
       hashMap.put("Original size", str1);
       hashMap.put("Requested size", str2);
       hashMap.put("queueTime", String.valueOf(this.g.c()));
       hashMap.put("Transcoder id", p3);
       hashMap.put("Transcoding result", String.valueOf(p2));
       return ImmutableMap.copyOf(hashMap);
    }
}
