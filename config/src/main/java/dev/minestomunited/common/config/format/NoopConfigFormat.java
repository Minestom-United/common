package dev.minestomunited.common.config.format;

import java.io.InputStream;
import java.io.OutputStream;

import dev.minestomunited.common.config.Config;
import dev.minestomunited.common.config.ConfigFormat;
import org.jetbrains.annotations.Nullable;

public class NoopConfigFormat implements ConfigFormat {

    @Override
    public @Nullable <C extends Config> C deserialize(Class<C> type, InputStream in) {
        return null;
    }

    @Override
    public void serialize(Config config, OutputStream out) {
    }
}
