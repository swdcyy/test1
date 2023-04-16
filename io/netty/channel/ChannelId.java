package io.netty.channel.ChannelId;
import java.io.Serializable;
import java.lang.Comparable;
import java.lang.String;

public interface abstract ChannelId implements Serializable, Comparable	// class@001075
{

    String asLongText();
    String asShortText();
}
