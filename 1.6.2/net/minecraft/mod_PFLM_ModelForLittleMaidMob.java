package net.minecraft.src;

public class mod_PFLM_ModelForLittleMaidMob extends BaseMod
{
	public String getVersion()
	{
		return "1.6.2-1c";
	}

	public void load()
	{
		if (!ModLoader.isModLoaded("PFLM_PlayerFormLittleMaid")) {
			//System.out.println("mod_PlayerFormLittleMaidModelForLittleMaidMob-!PFLM_PlayerFormLittleMaid");
			MMM_FileManager.getModFile("playerformlittlemaid", "MultiModel");
			MMM_TextureManager.instance.addSearch("playerformlittlemaid", "/assets/minecraft/textures/entity/littleMaid/", "MultiModel_");
			MMM_FileManager.getModFile("playerformlittlemaid", "playerformlittlemaid");
			MMM_TextureManager.instance.addSearch("playerformlittlemaid", "/assets/minecraft/textures/entity/littleMaid/", "MultiModel_");
		} else {
			//System.out.println("mod_PlayerFormLittleMaidModelForLittleMaidMob-load PFLM_PlayerFormLittleMaid");
		}
	}

	public void modsLoaded()
	{
	}
}
