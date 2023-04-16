package okhttp3.internal.connection.RouteDatabase;
import java.lang.Object;
import java.util.LinkedHashSet;
import okhttp3.Route;
import java.util.Set;

public final class RouteDatabase	// class@0020ac
{
    public final Set failedRoutes;

    public void RouteDatabase(){
       super();
       this.failedRoutes = new LinkedHashSet();
    }
    public synchronized void connected(Route p0){
       this.failedRoutes.remove(p0);
    }
    public synchronized void failed(Route p0){
       this.failedRoutes.add(p0);
    }
    public synchronized boolean shouldPostpone(Route p0){
       return this.failedRoutes.contains(p0);
    }
}
