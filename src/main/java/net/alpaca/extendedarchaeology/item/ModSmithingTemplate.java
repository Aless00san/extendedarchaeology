package net.alpaca.extendedarchaeology.item;

import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.ArrayList;
import java.util.List;

public class ModSmithingTemplate extends SmithingTemplateItem {

    private static final Formatting TITLE_FORMATTING;
    private static final Formatting HIGHLIGHT_FORMATTING;
    private static final String TRANSLATION_KEY;
    private static final Text INGREDIENTS_TEXT;
    private static final Text APPLIES_TO_TEXT;
    private static final Text TITLE;
    private static final Text DESC;
    private static final List<Identifier> MATERIAL_LIST = new ArrayList<Identifier>();;
    private static final List<Identifier> EXTRA_MATERIAL_LIST = new ArrayList<Identifier>();;;

    // Missing texts are titleText, baseSlotDescriptionText,  additionsSlotDescriptionText
    public ModSmithingTemplate() {
        super(APPLIES_TO_TEXT, INGREDIENTS_TEXT, TITLE, DESC, DESC, MATERIAL_LIST, EXTRA_MATERIAL_LIST);
    }

    // Variables for the creation of the Item
    static {
        TITLE_FORMATTING = Formatting.GRAY;
        HIGHLIGHT_FORMATTING = Formatting.YELLOW;
        TRANSLATION_KEY = Util.createTranslationKey("item", new Identifier("smithing_template"));
        INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("extendedarchaeology:smithing_template_applies_to"))).formatted(HIGHLIGHT_FORMATTING);
        APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("extendedarchaeology:smithing_template_ingredients"))).formatted(HIGHLIGHT_FORMATTING);
        TITLE = Text.translatable(Util.createTranslationKey("item", new Identifier("extendedarchaeology:smithing_template_title"))).formatted(TITLE_FORMATTING);
        DESC = Text.translatable(Util.createTranslationKey("item", new Identifier("extendedarchaeology:smithing_template_desc"))).formatted(TITLE_FORMATTING);
        MATERIAL_LIST.add(new Identifier("extendedarchaeology:item/ancient_weapon_part_1_shadow"));
        EXTRA_MATERIAL_LIST.add(new Identifier("extendedarchaeology:item/ancient_weapon_part_2_shadow"));
    }
}
