package com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$a;
import im8.g;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$d;
import vp4.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.edit.decoration.text.r;
import java.util.Map;
import java.util.HashMap;

public class StoryEditTextFragment$a implements g	// class@000ad3
{
    public StoryEditTextFragment b;
    public StoryTextDrawer c;
    public StoryTextDrawer d;
    public PublishSubject e;
    public StoryTextDataManager f;
    public StoryEditTextFragment$d g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public String m;
    public int n;
    public int o;
    public boolean p;
    public b q;
    public final StoryEditTextFragment r;

    public void StoryEditTextFragment$a(StoryEditTextFragment p0){
       this.r = p0;
       super();
       this.e = PublishSubject.g();
       this.f = new StoryTextDataManager();
       this.g = new StoryEditTextFragment$d(0);
       this.h = true;
       this.i = true;
       this.j = true;
       this.k = false;
       this.p = false;
       this.q = new b();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StoryEditTextFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, StoryEditTextFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(StoryEditTextFragment$a.class, new r());
       }else {
          obj.put(StoryEditTextFragment$a.class, null);
       }
       return obj;
    }
}
