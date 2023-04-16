package d43.a;
import im8.g;
import vl8.c;
import java.util.ArrayList;
import com.kuaishou.live.gameinteractive.model.board.GameBoardContainer;
import lnc.i3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import d43.g;
import d43.f;
import java.util.Map;
import java.util.HashMap;

public class a extends c implements g	// class@002440
{
    public LiveSlidePlayService c;
    public List d;
    public c e;
    public m$h f;
    public String g;
    public String h;
    public boolean i;
    public String j;
    public GameBoardContainer k;
    public PlayStatusInfo l;

    public void a(){
       super();
       this.d = new ArrayList();
       this.k = new GameBoardContainer();
    }
    public i3 N(){
       i3 obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       if (!TextUtils.isEmpty(this.g)) {
          obj.d("interaction_game_id", this.g);
       }
       return obj;
    }
    public boolean O(){
       return this.i;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new g();
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(a.class, new g());
       }else if(p0.equals("provider")){
          obj.put(a.class, new f());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
