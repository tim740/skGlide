package uk.tim740.skGlide;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.ExpressionType;
import ch.njol.skript.lang.util.SimpleEvent;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by tim740 on 03/10/2016
 */
public class skGlide extends JavaPlugin {

    @Override
    public void onEnable() {
        Skript.registerAddon(this);
        Skript.registerExpression(SExprGlideMode.class, Boolean.class, ExpressionType.PROPERTY, "glide (state|ability|mode) of %entity%", "%entity%'s glide (state|ability|mode)");
        Skript.registerEvent("GlideToggle", SimpleEvent.class, EntityToggleGlideEvent.class, "[elytra ]glide toggle");
    }
}
