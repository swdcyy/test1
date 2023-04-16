package me9.j$b;
import java.util.concurrent.Callable;
import me9.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;

public final class j$b implements Callable	// class@002ff3
{
    public final j b;

    public void j$b(j p0){
       this.b = p0;
       super();
    }
    public Object call(){
       JsonObject jsonObject = PatchProxy.apply(null, this, j$b.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          jsonObject = this.b.h();
       }
       return jsonObject;
    }
}
