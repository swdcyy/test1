package io.netty.channel.group.ChannelGroupException;
import java.lang.Iterable;
import io.netty.channel.ChannelException;
import java.util.Collection;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Collections;
import java.lang.IllegalArgumentException;
import java.util.Iterator;

public class ChannelGroupException extends ChannelException implements Iterable	// class@00109c
{
    public final Collection failed;
    public static final long serialVersionUID = 0xc73283b58c27aeb3;

    public void ChannelGroupException(Collection p0){
       super();
       Objects.requireNonNull(p0, "causes");
       if (p0.isEmpty()) {
          throw new IllegalArgumentException("causes must be non empty");
       }
       this.failed = Collections.unmodifiableCollection(p0);
       return;
    }
    public Iterator iterator(){
       return this.failed.iterator();
    }
}
