document.getElementById("btn").addEventListener("click", async () => {
  const name = document.getElementById("name").value || "kunieda";
  try {
    const res = await fetch(`/api/hello?name=${encodeURIComponent(name)}`);
    const data = await res.json();
    document.getElementById("result").textContent = data.message;
  } catch (err) {
    document.getElementById("result").textContent = "エラーが発生しました";
    console.error(err);
  }
})
  document.getElementById("btn2").addEventListener("click", async () => {
  const pass = document.getElementById("pass").value || "natsumi";
  try {
    const res = await fetch(`/api/pass?pass=${encodeURIComponent(pass)}`);
    const data = await res.json();
    document.getElementById("result2").textContent = data.message;
  } catch (err) {
    document.getElementById("result2").textContent = "エラーが発生しました";
    console.error(err);
  }
})

//ここから計算
  document.getElementById("btn3").addEventListener("click", async () => {
  const number1 = document.getElementById("number1").value;
  const number2 = document.getElementById("number2").value;
  try {
    const res = await fetch(`/api/sum?number1=${encodeURIComponent(number1)}&number2=${encodeURIComponent(number2)}`);
    const data = await res.json();
    document.getElementById("result3").textContent = data.message;
  } catch (err) {
    document.getElementById("result3").textContent = "エラーが発生しました";
    console.error(err);
  }
});