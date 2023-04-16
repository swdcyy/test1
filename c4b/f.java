package c4b.f;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import java.lang.String;
import skd.a;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Enum;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import c4b.e;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import s5b.b;
import java.lang.Throwable;
import w46.b;
import java.util.Collection;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import u4b.e;
import ekd.q;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import java.lang.Boolean;
import c4b.a;
import java.lang.Iterable;
import ok.o;
import qk.y;
import c4b.d;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public class f	// class@0004b0
{
    public a a;
    public List b;
    public List c;
    public MagicBusinessId d;
    public MagicEmoji e;
    public List f;
    public MagicEmoji g;
    public List h;
    public List i;
    public static final String j = "c4b.f";
    public static final f k;

    static {
       f.k = new f();
    }
    public void f(){
       super();
       this.c = new ArrayList();
       this.d = MagicBusinessId.VIDEO;
       this.f = new ArrayList();
       this.h = new ArrayList();
       this.i = new ArrayList();
       if (this.a == null) {
          this.a = a.b(a.a().a(), "magic_face_history");
       }
       return;
    }
    public static f b(){
       return f.k;
    }
    public void a(MagicEmoji p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "13")) {
          return;
       }
       MagicEmoji mId = p0.mId;
       if (p0.mTabType == 4) {
          f te = this.e;
          if (te != null) {
             mId = te.mId;
          }
       }
       p0 = p0.mMagicFaces;
       if (p0 != null) {
          int i = -1;
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             MagicEmoji$MagicFace magicFace = iterator.next();
             magicFace.mGroupId = mId;
             i = i + 1;
             magicFace.mMagicEmojiIndex = i;
          }
       }
       return;
    }
    public final String c(){
       Object obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "my_magic_face_"+this.d.name()+QCurrentUser.ME.getId();
    }
    public final List d(){
       ArrayList uArrayList;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, uof, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          return obj;
       }
       String str = this.c();
       List list = PatchProxy.applyOneRefs(str, this, uof, "7");
       if (list != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          String str1 = this.a.getString(str, objArray);
          if (!TextUtils.isEmpty(str1)) {
             try{
                list = a.a.i(str1, new e(this).getType());
             }catch(java.lang.Exception e1){
                Object[] objArray1 = new Object[0];
                b.D().u(f.j, e1, objArray1);
             }
             list = uArrayList;
          }else {
             goto label_0056 ;
          }
       }
       uArrayList = new ArrayList();
       Iterator iterator = new ArrayList(list).iterator();
       while (iterator.hasNext()) {
          MagicEmoji$MagicFace magicFace = iterator.next();
          if (e.a(magicFace) || !TextUtils.isEmpty(magicFace.mChildId)) {
             continue ;
          }
          uArrayList.add(magicFace);
       }
       this.b = uArrayList;
       return this.b;
    }
    public final void e(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "21")) {
          return;
       }
       if (!q.f(p0) && !TextUtils.isEmpty(p1)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             MagicEmoji$MagicFace magicFace = iterator.next();
             if (magicFace != null && p1.equals(magicFace.mId)) {
                iterator.remove();
                break ;
             }
          }
       }
       return;
    }
    public void f(MagicBusinessId p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       if (p0 != this.d) {
          this.d = p0;
          this.b = null;
          this.f = new ArrayList();
       }
       return;
    }
    public void g(MagicEmojiResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "12")) {
          return;
       }
       Iterator iterator = p0.mMagicEmojis.iterator();
       while (iterator.hasNext()) {
          MagicEmoji magicEmoji = iterator.next();
          MagicEmoji mTabType = magicEmoji.mTabType;
          if (mTabType == 3) {
             this.e = magicEmoji;
          }
          if (mTabType == 4) {
             this.g = magicEmoji;
          }
       }
       return;
    }
    public void h(MagicEmoji$MagicFace p0,boolean p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uof, "14")) {
          return;
       }
       uof = this.g;
       if (uof != null) {
          if (p1) {
             if (!uof.mMagicFaces.contains(p0)) {
                this.g.mMagicFaces.add(0, p0);
             }
          }else {
             y.q(uof.mMagicFaces, new a(p0));
          }
       }
       if (this.f.remove(p0) && p1) {
          this.f.add(0, p0);
       }
       return;
    }
    public void i(List p0){
       this.c = p0;
    }
    public void j(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "8")) {
          return;
       }
       c.k(new d(this, p0));
       return;
    }
}
