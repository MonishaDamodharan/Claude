package com.api.claude.constant;

public class Constant {
    public static String conversation =
            "Patient: Hello doctor, good evening.\n" +
            "\n" +
            "Doctor: Good evening. How can I help you today?\n" +
            "\n" +
            "Patient: For the past two days, I’ve been having a mild fever, body pain, and a sore throat.\n" +
            "\n" +
            "Doctor: I see. Can you tell me your current temperature when you check with a thermometer?\n" +
            "\n" +
            "Patient: Yes, it’s around 100.5°F.\n" +
            "\n" +
            "Doctor: Alright. Do you also have cough, breathing difficulty, or chest pain?\n" +
            "\n" +
            "Patient: I have a slight dry cough, but no breathing difficulty or chest pain.\n" +
            "\n" +
            "Doctor: Okay, that’s good. Do you have any existing medical conditions like diabetes, hypertension, or asthma?\n" +
            "\n" +
            "Patient: No, I don’t have any major health issues.\n" +
            "\n" +
            "Doctor: Are you taking any medications right now?\n" +
            "\n" +
            "Patient: Just paracetamol for the fever.\n" +
            "\n" +
            "Doctor: That’s fine. Based on your symptoms, it looks like a viral upper respiratory infection, possibly seasonal flu. I’d advise you to continue paracetamol for fever and body pain, drink plenty of warm fluids, do salt-water gargling for your throat, and take adequate rest.\n" +
            "\n" +
            "Patient: Alright, doctor. Do I need antibiotics?\n" +
            "\n" +
            "Doctor: No, antibiotics are not required unless we suspect a bacterial infection. If your fever persists beyond 4–5 days, or if you develop breathlessness, high fever, or chest pain, please consult me again immediately.\n" +
            "\n" +
            "Patient: Got it. Thank you, doctor.\n" +
            "\n" +
            "Doctor: You’re welcome. Take care and get well soon.";

    public static String template =
            "Patient Details:\n" +
            "\n" +
            "Name: [Patient’s Name]\n" +
            "\n" +
            "Age / Gender: [Age, Gender]\n" +
            "\n" +
            "Date: [Consultation Date]\n" +
            "\n" +
            "Chief Complaint:\n" +
            "\n" +
            "[Main problem patient reported, e.g., fever, sore throat]\n" +
            "\n" +
            "History of Present Illness:\n" +
            "\n" +
            "Duration: [How long symptoms present]\n" +
            "\n" +
            "Associated symptoms: [Cough, body pain, etc.]\n" +
            "\n" +
            "Severity: [Mild/Moderate/Severe]\n" +
            "\n" +
            "Past medical history: [Any existing diseases]\n" +
            "\n" +
            "Current medications: [What patient is taking]\n" +
            "\n" +
            "Examination (if applicable in online consult):\n" +
            "\n" +
            "Vitals: [Temperature, breathing difficulty, etc.]\n" +
            "\n" +
            "Observations: [Visible signs, if any]\n" +
            "\n" +
            "Doctor’s Impression / Provisional Diagnosis:\n" +
            "\n" +
            "[E.g., Viral upper respiratory infection / Seasonal flu]\n" +
            "\n" +
            "Advice / Treatment Plan:\n" +
            "\n" +
            "[Medication advice, rest, fluids, home remedies]\n" +
            "\n" +
            "[Warning signs to monitor]\n" +
            "\n" +
            "Follow-Up Instructions:\n" +
            "\n" +
            "[When to consult again, e.g., if fever persists >5 days or symptoms worsen]";
}
