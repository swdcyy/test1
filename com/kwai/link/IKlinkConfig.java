package com.kwai.link.IKlinkConfig;
import java.lang.String;

public interface abstract IKlinkConfig	// class@000d10
{

    long aggressiveHeartbeatTransferTimeout();
    long aggressivePingTransferTimeout();
    long backgroundHeartbeatInterval();
    int concurrentRaceCountLimit();
    long connectTimeout();
    long defaultCacheTimeout();
    long defaultTransferTimeout();
    long foregroundHeartbeatIntervalForTcp();
    int[] getDefaultIpv4QuicPorts();
    int[] getDefaultIpv4TcpPorts();
    int[] getDefaultIpv6QuicPorts();
    int[] getDefaultIpv6TcpPorts();
    String[] getFallbackDomains();
    String[] getFallbackIpv4QuicIps();
    String[] getFallbackIpv4TcpIps();
    String[] getFallbackIpv6QuicIps();
    String[] getFallbackIpv6TcpIps();
    String getQuicConfig();
    String getTraceConfig();
    long heartbeatInterval();
    boolean isBackgroundHeartbeatIntervalEnabled();
    boolean isDelayHeartbeatEnabled();
    boolean isFastLoginEnabled();
    boolean isPersistAccountInfoEnabled();
    boolean isPingForSleepEnabled();
    boolean isPushStatEnabled();
    boolean isQuicBlockEnabled();
    boolean isQuicEnabled();
    boolean isSampleBasicMessageEnabled();
    boolean isSleepModeEnabled();
    boolean isTcpEnabled();
    boolean isTraceEnabled();
    boolean isTransportLayerKeepaliveEnabled();
    long pingTransferTimeout();
    double pushStatSampleRate();
    long quicBlockInterval();
    int quicBlockThreshold();
    long sleepDelay();
    int totalRaceCountLimit();
    String transportLayerKeepaliveConfig();
}
