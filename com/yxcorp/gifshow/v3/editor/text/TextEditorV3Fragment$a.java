package com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment$a;
import im8.g;
import com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import rwc.j;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.text.z;
import java.util.Map;
import java.util.HashMap;

public class TextEditorV3Fragment$a implements g	// class@0013a2
{
    public TextEditorV3Fragment b;
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
    public PublishSubject s;
    public Action$Type t;
    public PublishSubject u;
    public EditorTimeLineView$e v;
    public FontViewModel w;
    public j x;
    public EditDecorationContainerView y;
    public final TextEditorV3Fragment z;

    public void TextEditorV3Fragment$a(TextEditorV3Fragment p0){
       this.z = p0;
       super();
       this.c = 10;
       this.d = "textEditor";
       this.h = PublishSubject.g();
       this.i = PublishSubject.g();
       this.j = PublishSubject.g();
       this.k = PublishSubject.g();
       this.l = 0;
       this.s = PublishSubject.g();
       this.t = Action$Type.TEXT;
       this.u = PublishSubject.g();
       this.x = new j(null);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextEditorV3Fragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new z();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, TextEditorV3Fragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(TextEditorV3Fragment$a.class, new z());
       }else {
          obj.put(TextEditorV3Fragment$a.class, null);
       }
       return obj;
    }
}
