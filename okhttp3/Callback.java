package okhttp3.Callback;
import okhttp3.Call;
import java.io.IOException;
import okhttp3.Response;

public interface abstract Callback	// class@002061
{

    void onFailure(Call p0,IOException p1);
    void onResponse(Call p0,Response p1);
}
