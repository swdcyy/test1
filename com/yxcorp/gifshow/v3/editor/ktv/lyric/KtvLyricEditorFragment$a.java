package com.yxcorp.gifshow.v3.editor.ktv.lyric.KtvLyricEditorFragment$a;
import im8.g;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.KtvLyricEditorFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.v;
import java.util.Map;
import java.util.HashMap;

public class KtvLyricEditorFragment$a implements g	// class@000fcc
{
    public KtvLyricEditorFragment b;
    public int c;
    public String d;
    public String e;
    public i f;
    public b g;
    public PublishSubject h;
    public PublishSubject i;
    public PublishSubject j;
    public PublishSubject k;
    public int l;
    public z m;
    public g n;
    public a o;
    public k p;
    public f q;
    public PublishSubject r;
    public Action$Type s;
    public FontViewModel t;
    public EditDecorationContainerView u;
    public final KtvLyricEditorFragment v;

    public void KtvLyricEditorFragment$a(KtvLyricEditorFragment p0){
       this.v = p0;
       super();
       this.c = 3;
       this.d = "lyricEditor";
       this.h = PublishSubject.g();
       this.i = PublishSubject.g();
       this.j = PublishSubject.g();
       this.k = PublishSubject.g();
       this.l = 0;
       this.s = Action$Type.SUBTITLE;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvLyricEditorFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new v();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, KtvLyricEditorFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(KtvLyricEditorFragment$a.class, new v());
       }else {
          obj.put(KtvLyricEditorFragment$a.class, null);
       }
       return obj;
    }
}
