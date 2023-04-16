package mx6.a;
import com.kwai.video.wayne.player.main.PlayerState;
import com.kwai.video.wayne.player.main.IWaynePlayer;

public interface abstract a	// class@002f0c
{

    PlayerState b();
    IWaynePlayer getPlayer();
    void pause();
    void start();
    void toggle();
}
