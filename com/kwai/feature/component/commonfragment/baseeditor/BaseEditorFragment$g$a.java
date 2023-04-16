package com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g$a;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashSet;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import java.util.List;

public class BaseEditorFragment$g$a	// class@0011ea
{
    public String a;
    public String b;
    public EmotionInfo c;
    public QMedia d;
    public List e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public String o;
    public int p;
    public float q;
    public HashSet r;
    public boolean s;

    public void BaseEditorFragment$g$a(){
       super();
       this.q = 0xbf800000;
    }
    public BaseEditorFragment$g a(){
       Object obj = PatchProxy.apply(null, this, BaseEditorFragment$g$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BaseEditorFragment$g(this);
    }
    public BaseEditorFragment$g$a b(boolean p0){
       this.k = p0;
       return this;
    }
    public BaseEditorFragment$g$a c(HashSet p0){
       this.r = p0;
       return this;
    }
    public BaseEditorFragment$g$a d(boolean p0){
       this.f = p0;
       return this;
    }
    public BaseEditorFragment$g$a e(boolean p0){
       this.j = p0;
       return this;
    }
    public BaseEditorFragment$g$a f(boolean p0){
       this.h = p0;
       return this;
    }
    public BaseEditorFragment$g$a g(EmotionInfo p0){
       this.c = p0;
       return this;
    }
    public BaseEditorFragment$g$a h(boolean p0){
       this.s = p0;
       return this;
    }
    public BaseEditorFragment$g$a i(boolean p0){
       this.g = p0;
       return this;
    }
    public BaseEditorFragment$g$a j(QMedia p0){
       this.d = p0;
       return this;
    }
    public BaseEditorFragment$g$a k(List p0){
       this.e = p0;
       return this;
    }
    public BaseEditorFragment$g$a l(String p0){
       this.a = p0;
       return this;
    }
}
