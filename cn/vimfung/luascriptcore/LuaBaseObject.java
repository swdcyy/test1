package cn.vimfung.luascriptcore.LuaBaseObject;
import java.lang.Object;
import nl5.a;
import java.util.Objects;
import cn.vimfung.luascriptcore.LuaNativeUtil;
import com.kwai.eve.theadpool.EveSchedulers;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.util.concurrent.ExecutorService;
import cn.vimfung.luascriptcore.LuaBaseObject$1;
import java.lang.Runnable;
import java.util.concurrent.Future;

public class LuaBaseObject	// class@000d34
{
    public int _nativeId;

    public void LuaBaseObject(){
       super();
       this._nativeId = 0;
    }
    public void LuaBaseObject(int p0){
       super();
       this._nativeId = p0;
    }
    public void finalize(){
       if (this._nativeId > null) {
          Objects.requireNonNull(a.b);
          if (a.a) {
             LuaNativeUtil.safelyReleaseNativeObject(this._nativeId);
          }else {
             EveSchedulers b = EveSchedulers.b;
             Objects.requireNonNull(b);
             ExecutorService uExecutorSer = PatchProxy.apply(null, b, EveSchedulers.class, "1");
             if (uExecutorSer == PatchProxyResult.class) {
                uExecutorSer = EveSchedulers.a.getValue();
             }
             uExecutorSer.submit(new LuaBaseObject$1(this));
          }
       }
       super.finalize();
       return;
    }
}
