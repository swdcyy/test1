package com.kuaishou.post.story.edit.decoration.text.c0$a;
import im8.g;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.post.story.edit.decoration.text.c0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import com.kuaishou.post.story.edit.decoration.text.q0;
import java.util.Map;
import java.util.HashMap;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import java.lang.Integer;
import ml8.c;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.kuaishou.post.story.edit.decoration.text.s0;

public class c0$a extends RecyclerView$Adapter implements g	// class@000ae1
{
    public StoryTextDrawer e;
    public Integer f;
    public int g;
    public String h;
    public int i;
    public final c0 j;

    public void c0$a(c0 p0){
       this.j = p0;
       super();
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, c0$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.j.x.size();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c0$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c0$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c0$a.class, new q0());
       }else {
          obj.put(c0$a.class, null);
       }
       return obj;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       c0$a uoa = c0$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          Object[] objArray = new Object[]{this.j.x.get(p1),Integer.valueOf(p1),this};
          p0.b.i(objArray);
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       f uof;
       c0$a uoa = c0$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uof = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uof != PatchProxyResult.class) {
          label_0030 :
             return uof;
          }
       }
       uof = new f(a.d(p0.getContext(), 0x7f0d1572, p0, false), new s0());
       goto label_0030 ;
    }
}
