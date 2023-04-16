package okhttp3.internal.connection.RouteSelector$Selection;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import okhttp3.Route;
import java.util.NoSuchElementException;

public final class RouteSelector$Selection	// class@0020ae
{
    public int nextRouteIndex;
    public final List routes;

    public void RouteSelector$Selection(List p0){
       super();
       this.nextRouteIndex = 0;
       this.routes = p0;
    }
    public List getAll(){
       return new ArrayList(this.routes);
    }
    public boolean hasNext(){
       boolean b = (this.nextRouteIndex < this.routes.size())? true: false;
       return b;
    }
    public Route next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       RouteSelector$Selection tnextRouteIn = this.nextRouteIndex;
       this.nextRouteIndex = tnextRouteIn + 1;
       return this.routes.get(tnextRouteIn);
    }
}
