package com.yxcorp.gifshow.albumcontrol.a;
import v79.b;
import java.lang.Object;
import java.lang.String;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import v79.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import w79.b;
import android.database.Cursor;
import com.yxcorp.gifshow.albumcontrol.AlbumControlState;
import java.lang.Boolean;
import v79.c;
import android.graphics.Bitmap;
import android.provider.MediaStore$Images$Media;
import com.yxcorp.gifshow.albumcontrol.AlbumAccessControlException;
import java.lang.StringBuilder;
import android.content.ContentValues;
import android.os.Bundle;
import java.lang.Integer;

public final class a	// class@00104b
{
    public static c a;
    public static final a b;

    static {
       a.b = new a();
       a.a = new b();
    }
    public void a(){
       super();
    }
    public static a k(a p0,String p1,ContentResolver p2,Uri p3,String[] p4,String p5,String[] p6,String p7,CancellationSignal p8,int p9,Object p10){
       b a;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       Objects.requireNonNull(p0);
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,p4,p5,p6,p7,null};
          uoa = PatchProxy.apply(objArray, p0, uoa, "4");
          if (uoa != PatchProxyResult.class) {
          label_0064 :
             return uoa;
          }
       }
       a.q(p1, "bizType");
       a.q(p2, "resolver");
       a.q(p3, "uri");
       a = b.a;
       a.c("ContentResolver.query", p1, a.b(p1));
       uoa = new a(AlbumControlState.ACCESSIBLE, p2.query(p3, p4, p5, p6, p7, null));
       goto label_0064 ;
    }
    public final boolean a(String p0,String p1){
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "apiName");
       a.q(p1, "bizType");
       obj = b.a;
       obj.c(p0, p1, obj.b(p1));
       return true;
    }
    public final c b(){
       return a.a;
    }
    public final a c(String p0,ContentResolver p1,Uri p2){
       b a;
       a.q(p0, "bizType");
       a.q(p1, "resolver");
       a.q(p2, "uri");
       a = b.a;
       a.c("MediaStore.Images.Media.getBitmap", p0, a.b(p0));
       return new a(AlbumControlState.ACCESSIBLE, MediaStore$Images$Media.getBitmap(p1, p2));
    }
    public final a d(String p0,ContentResolver p1,Bitmap p2,String p3,String p4){
       b a;
       a.q(p0, "bizType");
       a.q(p1, "resolver");
       a.q(p2, "source");
       a.q(p3, "title");
       a.q(p4, "description");
       a = b.a;
       a.c("MediaStore.Images.Media.insertImage\(bitmap\)", p0, a.b(p0));
       return new a(AlbumControlState.ACCESSIBLE, MediaStore$Images$Media.insertImage(p1, p2, p3, p4));
    }
    public final String e(String p0,ContentResolver p1,Bitmap p2,String p3,String p4){
       a.q(p0, "bizType");
       a.q(p1, "resolver");
       a.q(p2, "source");
       a.q(p3, "title");
       a.q(p4, "description");
       a uoa = this.d(p0, p1, p2, p3, p4);
       if (uoa.b()) {
          return uoa.a();
       }
       throw new AlbumAccessControlException("Album imagesMediaInsertImage access deny by Privacy, bizType="+p0);
    }
    public final a f(String p0,ContentResolver p1,Uri p2,String[] p3){
       b a;
       a.q(p0, "bizType");
       a.q(p1, "resolver");
       a.q(p2, "uri");
       a = b.a;
       a.c("MediaStore.Images.Media.query", p0, a.b(p0));
       return new a(AlbumControlState.ACCESSIBLE, MediaStore$Images$Media.query(p1, p2, p3));
    }
    public final a g(String p0,ContentResolver p1,Uri p2,ContentValues p3){
       b obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "bizType");
       a.q(p1, "resolver");
       a.q(p2, "uri");
       obj = b.a;
       obj.c("ContentResolver.insert", p0, obj.b(p0));
       return new a(AlbumControlState.ACCESSIBLE, p1.insert(p2, p3));
    }
    public final Uri h(String p0,ContentResolver p1,Uri p2,ContentValues p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "bizType");
       a.q(p1, "resolver");
       a.q(p2, "uri");
       a uoa = this.g(p0, p1, p2, p3);
       if (uoa.b()) {
          return uoa.a();
       }
       throw new AlbumAccessControlException("Album insert access deny by Privacy, bizType="+p0);
    }
    public final a i(String p0,ContentResolver p1,Uri p2,String[] p3,Bundle p4,CancellationSignal p5){
       b a;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,null};
          uoa = PatchProxy.apply(objArray, this, uoa, "8");
          if (uoa != PatchProxyResult.class) {
             return uoa;
          }
       }
       a.q(p0, "bizType");
       a.q(p1, "resolver");
       a.q(p2, "uri");
       a = b.a;
       a.c("ContentResolver.query\(Bundle\)", p0, a.b(p0));
       return new a(AlbumControlState.ACCESSIBLE, p1.query(p2, p3, p4, null));
    }
    public final a j(String p0,ContentResolver p1,Uri p2,String[] p3,String p4,String[] p5,String p6){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          Object obj = PatchProxy.apply(objArray, this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       return a.k(this, p0, p1, p2, p3, p4, p5, p6, null, 128, null);
    }
    public final a l(String p0,ContentResolver p1,Uri p2,ContentValues p3,String p4,String[] p5){
       b a;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,null,null};
          uoa = PatchProxy.apply(objArray, this, uoa, "16");
          if (uoa != PatchProxyResult.class) {
             return uoa;
          }
       }
       a.q(p0, "bizType");
       a.q(p1, "resolver");
       a.q(p2, "uri");
       a = b.a;
       a.c("ContentResolver.update", p0, a.b(p0));
       return new a(AlbumControlState.ACCESSIBLE, Integer.valueOf(p1.update(p2, p3, null, null)));
    }
}
