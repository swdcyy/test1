package com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment$c;
import im8.g;
import java.lang.Object;
import com.yxcorp.gifshow.prettify.g;
import p0c.h$a;
import n0c.b;
import p0c.h;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.prettify.n;
import java.util.Map;
import java.util.HashMap;

public class EditPrettifyFragment$c implements g	// class@001142
{
    public EditPrettifyFragment b;
    public BaseFragment c;
    public int d;
    public String e;
    public i f;
    public EditDecorationContainerView g;
    public String h;
    public boolean i;
    public final g j;
    public h k;
    public PublishSubject l;
    public p m;
    public e n;

    public void EditPrettifyFragment$c(){
       super();
       this.d = 18;
       this.e = "prettifyEdit";
       this.h = "";
       this.i = true;
       g og = new g();
       this.j = og;
       this.k = new h$a().d(og).b(2).a();
       this.l = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditPrettifyFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, EditPrettifyFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(EditPrettifyFragment$c.class, new n());
       }else {
          obj.put(EditPrettifyFragment$c.class, null);
       }
       return obj;
    }
}
