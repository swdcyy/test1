package kuaishou.perf.page.impl.PageDataModel;
import java.io.Serializable;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;

public class PageDataModel implements Serializable	// class@001be7
{
    public Map args;
    public String scene;
    public Map stage;
    public long totalCost;
    public String type;

    public void PageDataModel(){
       super();
       this.scene = "";
       this.type = "";
       this.args = new ConcurrentHashMap();
       this.stage = new ConcurrentHashMap();
    }
}
