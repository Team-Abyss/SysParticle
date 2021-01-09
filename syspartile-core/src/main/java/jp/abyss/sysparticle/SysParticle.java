package jp.abyss.sysparticle;

import jp.abyss.sysparticle.api.SysParticleAPI;
import jp.abyss.sysparticle.particle.SimpleParticleManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SysParticle extends JavaPlugin {

    @Override
    public void onEnable() {
        SysParticleAPI.setParticleManager(new SimpleParticleManager());
    }

    @Override
    public void onDisable() {

    }
}
