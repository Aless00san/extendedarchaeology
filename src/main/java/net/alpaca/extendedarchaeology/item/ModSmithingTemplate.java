package net.alpaca.extendedarchaeology.item;

import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

public class ModSmithingTemplate extends SmithingTemplateItem {

    private static final Formatting TITLE_FORMATTING;
    private static final String TRANSLATION_KEY;
    private static final Text INGREDIENTS_TEXT;
    private static final Text APPLIES_TO_TEXT;

    public ModSmithingTemplate(Text appliesToText, Text ingredientsText, Text titleText, Text baseSlotDescriptionText, Text additionsSlotDescriptionText, List<Identifier> emptyBaseSlotTextures, List<Identifier> emptyAdditionsSlotTextures) {
        super(APPLIES_TO_TEXT, INGREDIENTS_TEXT, titleText, baseSlotDescriptionText, additionsSlotDescriptionText, emptyBaseSlotTextures, emptyAdditionsSlotTextures);
    }

    static {
        TITLE_FORMATTING = Formatting.YELLOW;
        TRANSLATION_KEY = Util.createTranslationKey("item", new Identifier("smithing_template"));
        INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("extendedarchaeology:test_template_applies_to"))).formatted(TITLE_FORMATTING);
        APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("extendedarchaeology:test_template_ingredients"))).formatted(TITLE_FORMATTING);
    }
}
