package zv8.l;
import java.util.List;
import java.util.Map;
import com.google.protobuf.nano.MessageNano;
import java.lang.String;

public interface abstract l	// class@0043d4
{

    List actionFilters();
    Map availableActionConfig();
    MessageNano buildRealActionPage(List p0);
    boolean disableSourceFilter();
    List getUrlPaths();
    int maxActions();
    String subBiz();
}
