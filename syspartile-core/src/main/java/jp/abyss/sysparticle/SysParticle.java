package jp.abyss.sysparticle;

import jp.abyss.sysparticle.api.SysParticleAPI;
import jp.abyss.sysparticle.particle.SimpleParticleManager;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class SysParticle extends JavaPlugin {

    @Override
    public void onEnable() {
        if (!SysParticleAPI.hasParticleManager()) {
            SysParticleAPI.setParticleManager(new SimpleParticleManager());
            getLogger().info(ChatColor.AQUA + "API setting completed");
        }
    }

    @Override
    public void onDisable() {

    }
}
